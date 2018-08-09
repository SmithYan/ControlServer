/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author wy521
 */
public class ServerToOneClient extends Thread {

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    OutputStream os;
    PrintWriter pw;
    InputStream is;
    InputStreamReader isr;
    BufferedReader br;

    public ServerToOneClient(Socket s) throws IOException {
        socket = s;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
        start();
    }
  /**
     * 发送文字
     *
     * @param text 即将要发送的文字
     * @throws IOException 可能会抛出的异常
     */
    public void sendToClient(String text,Socket s) throws IOException {
        this.socket=s;
        OutputStream os = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(os);
        pw.write(text);
        pw.flush();
    }
    /**
     * 接收来自客户端的文字
     *
     * @return 返回接收的文字
     * @throws IOException 可能会抛出的异常
     */
    public String receiveFromClient(Socket s) throws IOException {
        this.socket=s;
        is = socket.getInputStream();
        isr = new InputStreamReader(is);
        br = new BufferedReader(isr);
        String info = null;
        while ((info = br.readLine()) != null) {
                return info;
            }
        return "";
    }
    /**
     * 关闭连接
     *
     * @throws IOException 可能会抛出的异常
     */
    public void close(Socket s) throws IOException {
        //4、关闭资源
        this.socket=s;
        br.close();
        is.close();
        pw.close();
        os.close();
        socket.close();
    }
}
