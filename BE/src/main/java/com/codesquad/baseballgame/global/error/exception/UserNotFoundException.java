package com.codesquad.baseballgame.global.error.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {
        super("해당하는 사용자를 찾을 수 없습니다.");
    }
}
