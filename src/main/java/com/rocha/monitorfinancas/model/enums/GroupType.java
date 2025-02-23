package com.rocha.monitorfinancas.model.enums;

public enum GroupType {

    INCOME, EXPENSE;

    public static GroupType fromString(String type) {
        if (type.equals("INCOME")) {
            return INCOME;
        } else if (type.equals("EXPENSE")) {
            return EXPENSE;
        }
        return null;
    }
}
