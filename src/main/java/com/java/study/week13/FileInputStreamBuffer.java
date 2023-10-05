package com.java.study.week13;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamBuffer {
    public static void main(String[] args) throws IOException {
        // 먼저 기반 스트림을 생성합니다.
        FileInputStream fileInputStream = new FileInputStream("test.txt");

        // 기반 스트림을 이용해 보조 스트림을 생성합니다.
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        // Bufferd**Stream 생성시 사이즈도 정의하여 생성할 수 있습니다.(2번째 파라미터: 8192)
        // default: 8192
        BufferedInputStream bis = new BufferedInputStream(fileInputStream, 8192);

        // 보조 스트림을 이용해 데이터를 읽습니다.
        bufferedInputStream.read();
    }
}
