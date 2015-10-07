/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import clases.CustomImageIcon;
import conexion.UConnection;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;

import javax.swing.*;

/**
 *
 * @author Crackz
 */
public class modificar extends javax.swing.JFrame {
    
    private FileInputStream fis;
    private int longitudBytes;
   
    public String title;
    
    public modificar() {
        initComponents();
        
        //icono de la ventana
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo2.png")).getImage());
        
        //fondo azul
        ((JPanel)getContentPane()).setOpaque(fal­se); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource("../imagenes/fondo.jpg")); 
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),u­no.getIconHeight());
        
        
        try{
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs= null;
        con = UConnection.getConnection();
        
        String sql = "SELECT titulo FROM libro";
        
              
           pstm = con.prepareStatement(sql);
           rs = pstm.executeQuery(); 
           while(rs.next()){
               
               this.titulo.addItem(rs.getString("titulo"));
               //ti=rs.getString("titulo");
           }
           
       }catch(Exception e){
           
           
       }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        autores = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        anio = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        editorial = new javax.swing.JTextField();
        isbn = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        titulo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        newtitulo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        i = new javax.swing.JLabel();
        lbFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Altas");
        setIconImages(null);
        setResizable(false);

        jLabel1.setText("Titulo:");

        jLabel2.setText("Autores:");

        jLabel3.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel3.setText("MODIFICAR");

        jLabel4.setText("numero de hojas:");

        jLabel5.setText("Ciudad:");

        jLabel6.setText("Año: ");

        jLabel8.setText("Editorial:");

        jLabel12.setText("ISBN");

        anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioActionPerformed(evt);
            }
        });

        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        jLabel7.setText("Titulo: ");

        jLabel9.setText("ID:");

        i.setText("jLabel10");

        lbFoto.setBackground(new java.awt.Color(0, 153, 255));
        lbFoto.setIcon(new CustomImageIcon(getClass().getResource("/imagenes/default.gif")));
        lbFoto.setPreferredSize(new java.awt.Dimension(100, 80));
        lbFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFotoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(autores, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(isbn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(editorial))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(i)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(newtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(autores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(i))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        String aut,til,nu,ciu,ed,is,an,id,sql;
        FileInputStream foto;
        
        aut=autores.getText();
        til=newtitulo.getText();
        nu= num.getText();
        ciu = ciudad.getText();
        ed = editorial.getText();
        is = isbn.getText();
        an = anio.getText();
        id = i.getText();
        foto = fis;
        
        try{    
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs= null;    
            
        con = UConnection.getConnection();
        //con.setAutoCommit(false);
        
        sql="update libro set autores='"+aut+"',titulo='"+til+"',num_hojas='"+nu+"',anio='"+an+"',ciudad='"+ciu+"',editorial='"+ed+"',estandar='"+is+"',foto='"+foto+"' where ID="+id;
        
        pstm = con.prepareStatement(sql);
        
        int confirmar = pstm.executeUpdate(sql);
        
        if(confirmar == 1){
        
            JOptionPane.showMessageDialog(null,"Registrado modificado","Modificar",1);
       }
        
        else{
        JOptionPane.showMessageDialog(null,"Registrado no modificado, revisar por favor","Modificar",1);
       }
        
        
        }
        
        catch(Exception e){
        } 
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed

        
        try{
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs= null;
            
        con = UConnection.getConnection();
        
        String sql="SELECT ID, autores, titulo, num_hojas, anio, ciudad, editorial, estandar FROM libro "
                + "WHERE titulo='"+titulo.getSelectedItem()+"'";
        
        
        
        pstm = con.prepareStatement(sql);
        rs= pstm.executeQuery();
        
        
            rs.next();
            this.autores.setText(String.valueOf(rs.getString("autores")));
            this.newtitulo.setText(String.valueOf(rs.getString("titulo")));
            this.i.setText(String.valueOf(rs.getString("ID")));
            this.anio.setText(String.valueOf(rs.getInt("anio")));
            this.ciudad.setText(String.valueOf(rs.getString("ciudad")));
            this.editorial.setText(String.valueOf(rs.getString("editorial")));
            this.isbn.setText(String.valueOf(rs.getString("estandar")));
            this.num.setText(String.valueOf(rs.getInt("num_hojas")));
          
            title=rs.getString("titulo");
            
            
            CustomImageIcon foto = getFoto(title);
                if(foto!=null)
                    {
                       lbFoto.setIcon(foto);
                    }if(foto==null){
                     lbFoto.setIcon(new CustomImageIcon(getClass().getResource("/imagenes/default.gif")));
                    }
                    lbFoto.updateUI();
               
            System.out.println("sale");
            
        }
        
        
        
       catch(Exception e){
        
           e.printStackTrace();
           throw new RuntimeException(e);
           
       } 
         
        
// TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

    private void lbFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFotoMouseClicked
        JFileChooser se = new JFileChooser();
        se.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = se.showOpenDialog(null);
        if(estado == JFileChooser.APPROVE_OPTION)
        {
            try {

                fis =  new FileInputStream(se.getSelectedFile());
                this.longitudBytes = (int)se.getSelectedFile().length();

                Image icono = ImageIO.read(se.getSelectedFile()).getScaledInstance(lbFoto.getWidth(), lbFoto.getHeight(), Image.SCALE_DEFAULT);
                lbFoto.setIcon(new ImageIcon(icono));
                lbFoto.updateUI();

            } catch (FileNotFoundException ex) {ex.printStackTrace();}
            catch (IOException ex){ex.printStackTrace();}
        }
    }//GEN-LAST:event_lbFotoMouseClicked

    
    public static CustomImageIcon getFoto(String tituloo)
    {
        String o = "Memoria de mis putas tristes";
        
        CustomImageIcon ii = null;
        

        try{
        
        Connection conn = null;
        PreparedStatement pstmm = null;
        ResultSet rss= null;
        
        conn = UConnection.getConnection();
        
        String sqll = "select foto from libro where titulo = \'"+tituloo+"\'" ;
        InputStream is = null;
            
           pstmm = conn.prepareStatement(sqll);
           rss = pstmm.executeQuery();
            System.out.println("entraaaaaa");
           if(rss.next()){
               is = rss.getBinaryStream(1);
               if(is != null)
               {
                   BufferedImage bi = ImageIO.read(is);
                   ii= new CustomImageIcon(bi);
               } else{
                   System.out.println("nulo");
                   ii=null;
               }
               
           }
       }catch(SQLException ex){ex.printStackTrace();}
        catch(IOException ex){ex.printStackTrace();}
        
        System.out.println("entrooooooo");
        return ii;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anio;
    private javax.swing.JTextField autores;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField editorial;
    private javax.swing.JLabel i;
    private javax.swing.JTextField isbn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JTextField newtitulo;
    private javax.swing.JTextField num;
    private javax.swing.JComboBox titulo;
    // End of variables declaration//GEN-END:variables
}