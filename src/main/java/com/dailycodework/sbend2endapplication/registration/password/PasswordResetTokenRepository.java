package com.dailycodework.sbend2endapplication.registration.password;

import com.dailycodework.sbend2endapplication.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    Optional<PasswordResetToken> findByToken(String theToken);
    Optional<PasswordResetToken> findByUser(User user);

}
