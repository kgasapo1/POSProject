package database;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Update_Employee extends javax.swing.JFrame {

    /**
     * Creates new form Update
     */
    public Update_Employee() {
        initComponents();
        mySettings();
        formLoad();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtRole = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JComboBox<>();

        setTitle("UPDATE EMPLOYEE");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setText("UPDATE EMPLOYEE");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Gender");

        txtRole.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Executive", "Admin", "Operator"}));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Mobile phone");

        txtMobile.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMobile.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Employee Name");

        txtName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtName.setToolTipText("");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setText("Role");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Address");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel20.setText("Your current email address");

        txtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEmail.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Your username");

        txtUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtUsername.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Your password");

        txtGender.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtGender.setToolTipText("");

        txtAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtAddress.setToolTipText("");

        btnSubmit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Employee ID");

        txtEmployeeID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEmployeeID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        txtEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	txtEmployeeIDActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnSubmit)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    	try{String mh = (String) txtEmployeeID.getSelectedItem();
    		String mk = txtName.getText();
  	  		String mj = txtUsername.getText();
  	  		String md = txtPassword.getText();
  	  		String mt = txtGender.getText();
  	  		String mm = txtAddress.getText();
  	  		String mn = txtMobile.getText();
  	  		String mo = txtEmail.getText();
  	  		String nn = (String) txtRole.getSelectedItem();
    	  try{
    	     Class.forName("com.mysql.jdbc.Driver").newInstance();
    	     Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://192.168.0.2/ken", "database", "");
    	     Statement stmt = con.createStatement();
    	    int bp = JOptionPane.showConfirmDialog(this,"Do you want to update the record ?");
    	     if(bp == JOptionPane.YES_OPTION){
    	         String query = "update item2 set employee_name = '"+mk+"', employee_username = '"+ mj+"', employee_password = '"+ md+"', employee_gender = '" + mt+"', employee_address = '"+ mm+"', employee_mobile = '"+mn+"', employee_email = '"+mo+"', employee_role = '"+ nn+"' where employee_id = '"+ mh +"';";
    	     stmt.execute(query); 
    	     JOptionPane.showMessageDialog(this,"Record has been updated");
    	     txtEmployeeID.setSelectedItem(null);
    	        txtName.setText(null);
    	        txtUsername.setText(null);
    	        txtPassword.setText(null);
    	        txtGender.setText(null);
    	        txtAddress.setText(null);
    	        txtMobile.setText(null);
    	        txtEmail.setText(null);
    	        txtRole.setSelectedItem(null);
    	     }
    	     if(bp == JOptionPane.CANCEL_OPTION){
    	    	 dispose(); 
    	         Update_Employee a = new Update_Employee();
    	         a.setVisible(true);
    	     }
    	      if(bp == JOptionPane.NO_OPTION){
    	    	 dispose(); 
    	    	 Update_Employee a = new Update_Employee();
     	         a.setVisible(true); 
    	     }
    	    
    	     stmt.close();
    	     con.close();
    	  
    	  }
    	  catch(Exception e)
    	  {
    	      JOptionPane.showMessageDialog(this,"Error in connectivity" );
    	  } 
    	}
    	catch(Exception e)
    	{
    	    JOptionPane.showMessageDialog(null,"Invalid Entry or field must be completely filled","message",2); 
    	}
    }                                         

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	txtEmployeeID.setSelectedItem(null);
        txtName.setText(null);
        txtUsername.setText(null);
        txtPassword.setText(null);
        txtGender.setText(null);
        txtAddress.setText(null);
        txtMobile.setText(null);
        txtEmail.setText(null);
        txtRole.setSelectedItem(null);
    }                                        

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        dispose();
    }                                       

    private void txtEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    	try{
        	try{
        		Class.forName("com.mysql.jdbc.Driver").newInstance();
        	    Connection co = (Connection)DriverManager.getConnection("jdbc:mysql://192.168.0.2/ken", "database", "");
        	    Statement stm = co.createStatement();
        		String sql = "Select * from item2 where employee_id = '"+ txtEmployeeID.getSelectedItem()+"'";
        		ResultSet rs = stm.executeQuery(sql);
        		while(rs.next())
        		{
        			String employeeName = rs.getString("employee_name");
        			txtName.setText(employeeName);
        			String employeeUsername = rs.getString("employee_username");
        			txtUsername.setText(employeeUsername);
        			String employeePassword = rs.getString("employee_password");
        			txtPassword.setText(employeePassword);
        			String employeeGender = rs.getString("employee_gender");
        			txtGender.setText(employeeGender);
        			String employeeAddress = rs.getString("employee_address");
        			txtAddress.setText(employeeAddress);
        			String employeeMobile = rs.getString("employee_mobile");
        			txtMobile.setText(employeeMobile);
        			String employeeEmail = rs.getString("employee_email");
        			txtEmail.setText(employeeEmail);
        			String employeeRole = rs.getString("employee_role");
        			txtRole.setSelectedItem(employeeRole);
        		}
        	}
        	catch(Exception e)
        	  {
        	      JOptionPane.showMessageDialog(this,"Error in connectivity" );
        	  }  
        	}
        	catch(Exception e)
        	{
        	    JOptionPane.showMessageDialog(null,"Invalid Entry","message",2); 
        	}
    } 
    
    public void formLoad(){
    	try{
    		Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    Connection co = (Connection)DriverManager.getConnection("jdbc:mysql://192.168.0.2/ken", "database", "");
    	    Statement stm = co.createStatement();
    		String sql = "Select employee_id from item2 order by employee_id DESC";
    		ResultSet rs = stm.executeQuery(sql);
    		while(rs.next())
    		{
    			txtEmployeeID.addItem(Integer.toString(rs.getInt("employee_id")));
    		}
    	}
    	catch(Exception e)
    	{
    		JOptionPane.showMessageDialog(this,"Error in connectivity" );
    	}
    	txtEmployeeID.setSelectedItem(null);
    	txtName.setText(null);
    	txtUsername.setText(null);
    	txtPassword.setText(null);
    	txtGender.setText(null);
    	txtAddress.setText(null);
    	txtMobile.setText(null);
    	txtEmail.setText(null);
    	txtRole.setSelectedItem(null);
    }
    
    
    public void mySettings(){
        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();

        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;    
        setLocation(dx, dy);
    }

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
            java.util.logging.Logger.getLogger(Update_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Employee().setVisible(true);
            }
        });
    }

 // Variables declaration - do not modify                     
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JComboBox<String> txtEmployeeID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JComboBox<String> txtRole;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration                
}