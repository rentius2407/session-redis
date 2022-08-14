package com.tut;

import org.junit.jupiter.api.Test;

import java.util.Base64;

public class ScratchPadTest {

    @Test
    public void decode() {
        byte[] decode = Base64.getDecoder().decode("MjY0ZDhmMjQtOWNkMy00NDhhLTg4NjAtYWQwZDZhZDVmZTA0".getBytes());
        System.out.println(new String(decode));
    }
}
