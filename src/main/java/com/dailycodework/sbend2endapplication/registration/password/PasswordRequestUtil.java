package com.dailycodework.sbend2endapplication.registration.password;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PasswordRequestUtil {
    private String email;
    private String oldPassword;
    private String newPassword;
}
