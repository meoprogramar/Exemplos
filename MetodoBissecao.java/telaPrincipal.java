package calculonumericoFinalmente;
import javax.swing.JOptionPane;
public class telaPrincipal extends javax.swing.JFrame {
    public telaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private double x,y;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vIntervalo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vIntervalo2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnErro = new javax.swing.JButton();
        btnInteracoes = new javax.swing.JButton();
        btnIntErro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoTxt = new javax.swing.JTextField();
        campoTxt2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        lblRaiz = new javax.swing.JLabel();
        lblInteracoes = new javax.swing.JLabel();
        lblRaizFunc = new javax.swing.JLabel();
        lblErroAbs = new javax.swing.JLabel();
        lblErroRel = new javax.swing.JLabel();
        lblErroPerc = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        minimoInt = new javax.swing.JLabel();
        minimoInt2 = new javax.swing.JLabel();
        intervalo = new javax.swing.JLabel();

        jLabel1.setText("MÉTODO DA BISSECÇÃO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(93, 161, 191));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setText("Informe o intervalo desejado ");

        vIntervalo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vIntervalo1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText(",");

        vIntervalo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vIntervalo2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setText("Escolha a condição de parada desejada abaixo:");

        btnErro.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnErro.setText("Erro");
        btnErro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErroActionPerformed(evt);
            }
        });

        btnInteracoes.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        btnInteracoes.setText("Iterações");
        btnInteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInteracoesActionPerformed(evt);
            }
        });

        btnIntErro.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnIntErro.setText("Iterações ou Erro");
        btnIntErro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntErroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MÉTODO DA BISSECÇÃO");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        campoTxt.setEnabled(false);
        campoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTxtActionPerformed(evt);
            }
        });

        campoTxt2.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("[");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setText("]");

        btnConfirmar.setText("Confirmar");
        btnConfirmar.setEnabled(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblRaiz.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        lblInteracoes.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        lblRaizFunc.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        lblErroAbs.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        lblErroRel.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        lblErroPerc.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculonumericoFinalmente/Capturar.PNG"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        minimoInt.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        minimoInt2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        intervalo.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        intervalo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblInteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTxt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnErro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnIntErro))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, 0)
                                        .addComponent(vIntervalo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, 0)
                                        .addComponent(vIntervalo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblErroPerc, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                            .addComponent(lblErroRel, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                            .addComponent(lblErroAbs, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                            .addComponent(lblRaizFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                            .addComponent(lblRaiz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                            .addComponent(minimoInt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minimoInt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(intervalo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vIntervalo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(vIntervalo2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnIntErro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnErro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(intervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRaizFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErroAbs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErroRel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErroPerc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minimoInt, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minimoInt2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void vIntervalo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vIntervalo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vIntervalo1ActionPerformed
    private void vIntervalo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vIntervalo2ActionPerformed
    }//GEN-LAST:event_vIntervalo2ActionPerformed
    private void btnErroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErroActionPerformed
        jLabel7.setText("");
        campoTxt2.setText("");
        campoTxt2.setEnabled(false);
        x = Double.parseDouble(vIntervalo1.getText());
        y = Double.parseDouble(vIntervalo2.getText());
        if((x<=0) || (y<=0) || ((funcaoPrincipal(x))*(funcaoPrincipal(y))>0)){
            JOptionPane.showMessageDialog(null,"O valor informado não possuei raizes, tente novamente.");
        }
        else{
        btnConfirmar.setEnabled(true);
        btnInteracoes.setEnabled(false);
        btnIntErro.setEnabled(false);
        vIntervalo1.setEnabled(false);
        vIntervalo2.setEnabled(false);
        jLabel6.setText("Informe o erro desejado: ");
        campoTxt.setEnabled(true);
        verificar = 1;
        }
        
    
    }//GEN-LAST:event_btnErroActionPerformed
    //=======declaração de variaveis manuais==================================
    private int nite, ite,verificar,aux1,aux2;
    private double xmedio, xant, erro,a,b, backupA, backupB, backupA2, backupB2;
    public double funcaoErroAbs(double x2, double x1){
        return Math.abs( x2-x1 );
    }
    public double funcaoPrincipal(double d){
        return (25*(d*d)) + Math.log(d)-0.00015;
    }
    public double funcaoErro(double x2, double x1){
        return Math.abs( (x2-x1)/x2 );
    }
    
    public double funcaoMinIte(double a, double b, double erro)
    {        
        return (( Math.log(Math.abs(a-b)) - Math.log(erro) )/ Math.log(2));        
    }
    
    public double funcaoMinIte2(double a, double b, double erro)
    {        
        return (( Math.abs(a-b) - Math.log(erro) )/ Math.log(2));        
    }
    //========================================================================
    private void campoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTxtActionPerformed

    private void btnInteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInteracoesActionPerformed
        jLabel7.setText("");
        campoTxt2.setText("");
        campoTxt2.setEnabled(false);
        x = Double.parseDouble(vIntervalo1.getText());
        y = Double.parseDouble(vIntervalo2.getText());
        if((x<=0) || (y<=0) || ((funcaoPrincipal(x))*(funcaoPrincipal(y))>0)){
           JOptionPane.showMessageDialog(null,"O valor informado não possuei raizes, tente novamente.");
        }else{
        btnConfirmar.setEnabled(true);
        vIntervalo1.setEnabled(false);
        vIntervalo2.setEnabled(false);
        jLabel6.setText("Informe o número de interações:");
        campoTxt.setEnabled(true);
        btnErro.setEnabled(false);
        btnIntErro.setEnabled(false);
        verificar = 2;
        }
    }//GEN-LAST:event_btnInteracoesActionPerformed

    private void btnIntErroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntErroActionPerformed
        x = Double.parseDouble(vIntervalo1.getText());
        y = Double.parseDouble(vIntervalo2.getText());
        if((x<=0) || (y<=0) || ((funcaoPrincipal(x))*(funcaoPrincipal(y))>0)){
           JOptionPane.showMessageDialog(null,"O valor informado não possuei raizes, tente novamente.");
        }else{
        btnConfirmar.setEnabled(true);
        vIntervalo1.setEnabled(false);
        vIntervalo2.setEnabled(false);
        jLabel6.setText("Informe o número de interações:");
        jLabel7.setText("Informe o erro desejado:");
        campoTxt.setEnabled(true);
        campoTxt2.setEnabled(true);
        btnErro.setEnabled(false);
        btnInteracoes.setEnabled(false);
        verificar = 3;
        }
    }//GEN-LAST:event_btnIntErroActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        btnErro.setEnabled(true);
        btnIntErro.setEnabled(true);
        btnInteracoes.setEnabled(true);
        vIntervalo1.setEnabled(true);
        vIntervalo2.setEnabled(true);
        a =  Double.parseDouble(vIntervalo1.getText());
        b =  Double.parseDouble(vIntervalo2.getText());
        backupA=backupA2=a;
        backupB=backupB2=b;
        switch(verificar){
            case 1:
                erro = Float.parseFloat(campoTxt.getText());
                nite = 0;  
                        do
                        {
                            nite++;
                            xant=this.xmedio;
                            this.xmedio = (this.a+this.b)/2; 
                            if(this.funcaoPrincipal(a)*this.funcaoPrincipal(this.xmedio)<0)
                            {                     
                                this.b=xmedio;
                                if(nite==1)                        
                                    this.xant=a;                     
                            }
                            else
                            {
                                this.a=xmedio;
                                if(nite==1)
                                    this.xant=b;
                            }                     
                        }
                        while(erro < this.funcaoErro(xmedio,xant));
                        
                        aux1=(int)Math.abs(Math.ceil(funcaoMinIte(backupA,backupB,erro)));
                       lblRaiz.setText("Raiz: "+String.valueOf(xmedio));
                       lblInteracoes.setText("f(raiz): "+String.valueOf(funcaoPrincipal(xmedio)));
                       lblErroAbs.setText("Erro Absoluto: "+String.valueOf(funcaoErroAbs(xmedio,xant)));
                       lblErroRel.setText("Erro Relativo: "+String.valueOf(funcaoErro(xmedio,xant)));
                       lblErroPerc.setText("Erro Percentual: "+String.valueOf(funcaoErro(xmedio,xant)*100)+"%");
                       lblRaizFunc.setText("Iterações: "+String.valueOf(nite));
                       minimoInt.setText("Mínimo de "+(aux1)+" iterações para o Erro Absoluto");
                       minimoInt2.setText("Mínimo de "+nite+" iterações para o Erro Relativo.");
                       intervalo.setText("Intervalo: [ "+backupA+" , "+backupB+" ]");
            break;
            
            case 2:
               ite = Integer.parseInt(campoTxt.getText());
                nite=0;
                do
                {
                    nite++;
                    xant=this.xmedio;
                    this.xmedio = (this.a+this.b)/2; 
                    if(this.funcaoPrincipal(a)*this.funcaoPrincipal(this.xmedio)<0)
                    {                     
                        this.b=xmedio;
                        if(nite==1)                        
                            this.xant=a;                     
                    }
                    else
                    {
                        this.a=xmedio;
                        if(nite==1)
                            this.xant=b;
                    }
                }
                while(this.nite < ite);
                lblRaiz.setText("Raiz: "+String.valueOf(xmedio));
                lblInteracoes.setText("f(raiz): "+String.valueOf(funcaoPrincipal(xmedio)));
                lblErroAbs.setText("Erro Absoluto: "+String.valueOf(funcaoErroAbs(xmedio,xant)));
                lblErroRel.setText("Erro Relativo: "+String.valueOf(funcaoErro(xmedio,xant)));
                lblErroPerc.setText("Erro Percentual: "+String.valueOf(funcaoErro(xmedio,xant)*100)+"%");
                lblRaizFunc.setText("Iterações: "+String.valueOf(nite));
                intervalo.setText("Intervalo: [ "+backupA+" , "+backupB+" ]");
                minimoInt.setText("");
                minimoInt2.setText("");
            break;
            
            case 3:
                nite=0;
                erro = Float.parseFloat(campoTxt2.getText());
                ite = Integer.parseInt(campoTxt.getText());
                do
                {
                    nite++;
                    xant=this.xmedio;
                    this.xmedio = (this.a+this.b)/2; 
                    if(this.funcaoPrincipal(a)*this.funcaoPrincipal(this.xmedio)<0)
                    {                     
                        this.b=xmedio;
                        if(nite==1)                        
                            this.xant=a;                     
                    }
                    else
                    {
                        this.a=xmedio;
                        if(nite==1)
                            this.xant=b;
                    }
                }
                while((this.nite < this.ite) && erro < this.funcaoErro(xmedio,xant));
                
                aux1=(int)Math.abs(Math.ceil(funcaoMinIte(backupA,backupB,erro)));
                lblRaiz.setText("Raiz: "+String.valueOf(xmedio));
                lblInteracoes.setText("f(raiz): "+String.valueOf(funcaoPrincipal(xmedio)));
                lblErroAbs.setText("Erro Absoluto: "+String.valueOf(funcaoErroAbs(xmedio,xant)));
                lblErroRel.setText("Erro Relativo: "+String.valueOf(funcaoErro(xmedio,xant)));
                lblErroPerc.setText("Erro Percentual: "+String.valueOf(funcaoErro(xmedio,xant)*100)+"%");
                lblRaizFunc.setText("Iterações: "+String.valueOf(nite));
                minimoInt.setText("Mínimo de "+aux1+" iterações para o Erro Absoluto");
                
                nite=0;
                xant=0;
                this.xmedio=0;
                this.a=backupA2;
                this.b=backupB2;
                do
                {
                    nite++;
                    xant=this.xmedio;
                    this.xmedio = (this.a+this.b)/2; 
                    if(this.funcaoPrincipal(a)*this.funcaoPrincipal(this.xmedio)<0)
                    {                     
                        this.b=xmedio;
                        if(nite==1)                        
                            this.xant=a;                     
                    }
                    else
                    {
                        this.a=xmedio;
                        if(nite==1)
                            this.xant=b;
                    }
                }
                while(erro < this.funcaoErro(xmedio,xant));                
                
                minimoInt2.setText("Mínimo de "+nite+" iterações para o Erro Relativo.");
                intervalo.setText("Intervalo: [ "+backupA2+" , "+backupB2+" ]");
                
            break;
        }
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnErro;
    private javax.swing.JButton btnIntErro;
    private javax.swing.JButton btnInteracoes;
    private javax.swing.JTextField campoTxt;
    private javax.swing.JTextField campoTxt2;
    private javax.swing.JLabel intervalo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblErroAbs;
    private javax.swing.JLabel lblErroPerc;
    private javax.swing.JLabel lblErroRel;
    private javax.swing.JLabel lblInteracoes;
    private javax.swing.JLabel lblRaiz;
    private javax.swing.JLabel lblRaizFunc;
    private javax.swing.JLabel minimoInt;
    private javax.swing.JLabel minimoInt2;
    private javax.swing.JTextField vIntervalo1;
    private javax.swing.JTextField vIntervalo2;
    // End of variables declaration//GEN-END:variables
}
