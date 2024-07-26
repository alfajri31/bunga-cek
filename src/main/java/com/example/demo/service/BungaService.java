package com.example.demo.service;

import com.example.demo.dto.BungaDto;
import com.example.demo.dto.BungaResp;

public class BungaService implements BungaInterface {


    @Override
    public BungaResp bungaService(BungaDto bungaDto) {
        Integer bunga;
        bunga = bungaDto.getBunga() * (bungaDto.getTenor() / 360) * bungaDto.getJumlahPinjaman();
        BungaResp bungaResp = new BungaResp();
        bungaResp.setHasil(bunga);
        return bungaResp;
    }
}
