/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author mori
 */
public class HelloService {

    /**
     * 挨拶メッセージを返すメソッド
     * @param name 挨拶メッセージに加える名前
     * @return 挨拶メッセージ
     */
    public static String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
