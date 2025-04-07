package kr.co.greenuniv.service;

import kr.co.greenuniv.dto.UserDTO;
import kr.co.greenuniv.entity.User;
import kr.co.greenuniv.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {

    private ModelMapper modelMapper;
    private PasswordEncoder passwordEncoder;
    private UserRepository userRepository;

    public void register(UserDTO userDTO) {

        // 비밀번호 암호화
        String encodedPass = passwordEncoder.encode(userDTO.getPass());
        userDTO.setPass(encodedPass);

        // 엔티티 변환
        User user = modelMapper.map(userDTO, User.class);

        // 저장
        userRepository.save(user);

    }

}
