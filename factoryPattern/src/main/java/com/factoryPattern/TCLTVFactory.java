package com.factoryPattern;
public class TCLTVFactory implements TVFactory
{
    public TV produceTV()
    {
    	System.out.println("TCL���ӻ����TCL���ӻ�");
    	return new TCLTV();
    }
}