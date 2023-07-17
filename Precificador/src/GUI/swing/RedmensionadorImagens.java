/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.swing;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

/**
 *
 * @author isaqu
 */
public class RedmensionadorImagens {
    
   public static ImageIcon iconeRedemensionado(URL url, int width, int height) {
     // Redimensiona o tamanho do icone que aparece no botão
     ImageIcon icon = new ImageIcon(url);
     Image img = icon.getImage();
     Image imgScale = img.getScaledInstance( width, height, Image.SCALE_SMOOTH);
     ImageIcon scaledIcon = new ImageIcon(imgScale);
     return scaledIcon;
   }
   
   public static String pmTo24(String entrada){
   if (entrada.split(":")[1].split(" ")[1].equals("PM")) {
                    String saida="";
                    saida+= (Integer.parseInt(entrada.split(":")[0])==12? Integer.parseInt(entrada.split(":")[0]):Integer.parseInt(entrada.split(":")[0])+12);
                    saida+=":"+entrada.split(":")[1].split(" ")[0];
                    return saida;
                } else {

                    String saida="";
                    saida+= Integer.parseInt(entrada.split(":")[0])==12? "00:"+entrada.split(":")[1].split(" ")[0]:entrada.split(" ")[0];
                    return saida;
                }
   }
   
}
