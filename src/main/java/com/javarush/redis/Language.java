package com.javarush.redis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Language {

    private String language;

    private Boolean isOfficial;

    private BigDecimal percentage;
}
