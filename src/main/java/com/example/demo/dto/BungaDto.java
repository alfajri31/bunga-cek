package com.example.demo.dto;

import lombok.Data;

@Data
public class BungaDto {
    private Integer tenor;
    private Integer JumlahPinjaman;
    private Integer bunga;
//    rumus bunga = bunga% * (tenor / 360) * jp
//            bunga = 10
//    tenor = 30
//    jumlah pinjaman = 100 ribu
//    bunga = % * (tenor/360) * jp
}
