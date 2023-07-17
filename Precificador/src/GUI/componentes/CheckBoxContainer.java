

package GUI.componentes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import GUI.swing.CheckBoxCustom;
import javax.swing.JLabel;

public class CheckBoxContainer extends javax.swing.JPanel {

    

    public CheckBoxContainer() {
        initComponents();
    }
    /*
    public CheckBoxContainer(Aluno aluno, int id_Atividade) {
        initComponents();
        this.aluno = aluno;
        String texto = aluno.getNome();
        for (int i = aluno.getNome().length(); i < 42; i++) {
            texto+=" ";
        }
        jLabel1.setText(texto);
        
        preencherLayeredPane(id_Atividade);
    }    

    public void preencherLayeredPane() {
        Aluno_AtividadeDao aluno_AtividadeDao = new Aluno_AtividadeDao();
        ArrayList<Aluno_Atividade> listaAluno_Atividades = aluno_AtividadeDao.buscarAtividadesDeUmAluno(aluno.getId_aluno());
        for (Aluno_Atividade aluno_Atividade : listaAluno_Atividades) {
            CheckBoxCustom checkBox = new CheckBoxCustom();
            checkBox.setAluno_id(aluno_Atividade.getAluno().getId_aluno());
            checkBox.setAtividade_id(aluno_Atividade.getAtividade().getId_atividade());
            checkBox.setText("");
            if (aluno_Atividade.getAluno_Ativadade_entrega()) {
                checkBox.setSelected(true);
            }
            jLayeredPane1.add(checkBox);
        }
    }
    public void preencherLayeredPane(int id_Atividade) {
        
            CheckBoxCustom checkBox = new CheckBoxCustom();
            checkBox.setAluno_id(aluno.getId_aluno());
            checkBox.setAtividade_id(id_Atividade);
            checkBox.setText("");
            
            jLayeredPane1.add(checkBox);
        
    }

    public void alterarSelecionados() {
        Aluno_AtividadeDao aluno_AtividadeDao = new Aluno_AtividadeDao();
        for (int i = 0; i < jLayeredPane1.getComponentCount(); i++) {
            CheckBoxCustom checkBox = (CheckBoxCustom) jLayeredPane1.getComponent(i);
            if (checkBox.isSelected()) {
                Calendar calendario = Calendar.getInstance();
                Date utilDate = calendario.getTime();
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); 
                Atividades atividades = new Atividades();
                atividades.setId_atividade(checkBox.getAtividade_id());
                Aluno_Atividade aluno_Atividade = new Aluno_Atividade();
                aluno_Atividade.setAluno(aluno);
                aluno_Atividade.setAluno_Ativadade_entrega(true);
                aluno_Atividade.setAtividade(atividades);
                aluno_Atividade.setAluno_Atividade_data_entrega(sqlDate);
                
                aluno_AtividadeDao.atualizar(aluno_Atividade);
                
            }else{
                Atividades atividades = new Atividades();
                atividades.setId_atividade(checkBox.getAtividade_id());
                Aluno_Atividade aluno_Atividade = new Aluno_Atividade();
                aluno_Atividade.setAluno(aluno);
                aluno_Atividade.setAluno_Ativadade_entrega(false);
                aluno_Atividade.setAtividade(atividades);
                aluno_Atividade.setAluno_Atividade_data_entrega(null);
                aluno_AtividadeDao.atualizar(aluno_Atividade);
            }
        }
    }
*/
    public JLabel getjLabel1() {
        return jLabel1;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(246, 246, 249));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLayeredPane1.setLayout(new java.awt.FlowLayout(1, 3, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
