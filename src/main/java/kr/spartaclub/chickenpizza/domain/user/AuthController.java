package kr.spartaclub.chickenpizza.domain.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 충돌 전 원본 코드 (develop)
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    @PostMapping
    public ResponseEntity<?> signup() {
        return ResponseEntity.ok("회원가입 성공!");
    }
}
