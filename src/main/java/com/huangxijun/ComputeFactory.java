package com.huangxijun;

public class ComputeFactory {

    public static String packagePath = "com.huangxijun";

    public static Computable getCompute(String symbol) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (Computable) Class.forName(packagePath + '.' + symbol).newInstance();
    }
}
