package com.itp.final2020;

public enum Sex {
    MALE,
    FEMALE;

    public Sex oppositeSex(Sex sex) {
        if (sex == MALE) {
            return FEMALE;
        }
        return MALE;
    }
}
