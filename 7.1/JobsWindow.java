
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionEvent;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.color.*;

public class JobsWindow implements ActionListener{
    public TempArrays everyArray;
        
 
        
        public JobsPage(TempArrays everyArray)
        {



            /*              
                 ______     __  __     __    
                /\  ___\   /\ \/\ \   /\ \   
                \ \ \__ \  \ \ \_\ \  \ \ \  
                 \ \_____\  \ \_____\  \ \_\ 
                  \/_____/   \/_____/   \/_/ 
                             
             */


            // create a frame
            f = new JFrame("CodeMonkeys HR App");
            f.getContentPane().setBackground(Color.GRAY);
            f.setLayout(null);
            f.setResizable(false);

     
            // create a menubar
            JMenuBar mb = new JMenuBar();
            mb.setBackground(Color.GRAY);
     
            // create a menu
            JMenu filemenu = new JMenu("File");
            JMenu prefmenu = new JMenu("Preferences");
     
            // create menuitems
            JMenuItem m1 = new JMenuItem("Load File");
            JMenuItem m2 = new JMenuItem("Export File");
            JMenuItem m3 = new JMenuItem("Save");
     
            // add menu items to menu
            filemenu.add(m1);
            filemenu.add(m2);
            filemenu.add(m3);
     
            // add menu to menu bar
            mb.add(filemenu);
            mb.add(prefmenu);
     
            // add menubar to frame
            f.setJMenuBar(mb);
     
            // set the size of the frame
            f.setSize(850, 700);
            f.setVisible(true);

            JButton load = new JButton("Load");
            load.setBounds(50, 550, 220,30);

            JButton saveChanges = new JButton("Save Changes");
            saveChanges.setBounds(290, 550, 220,30);

            JTextField placesOfWork = new JTextField();
            JLabel placesOfWorkLabel = new JLabel("Places Of Work");
            placesOfWork.setBounds(180, 70, 600, 50);
            placesOfWorkLabel.setBounds(50, 70, 100, 70);

            JTextField tasksPerformed = new JTextField();
            JLabel tasksPerformedLabel = new JLabel("Tasks Performed");
            tasksPerformed.setBounds(180, 130, 600, 50);
            tasksPerformedLabel.setBounds(50, 130, 100, 70);

            JTextField experience = new JTextField();
            JLabel experienceLabel = new JLabel("Experience");
            experience.setBounds(180, 190, 600, 50);
            experienceLabel.setBounds(50, 190, 100, 70);

            JTextField jobTitle = new JTextField();
            JLabel jobTitleLabel = new JLabel("Job Title");
            jobTitle.setBounds(180, 250, 600, 50);
            jobTitleLabel.setBounds(50, 250, 100, 70);

            JTextField teamRole = new JTextField();
            JLabel teamRoleLabel = new JLabel("Team Role");
            teamRole.setBounds(180, 310, 600, 50);
            teamRoleLabel.setBounds(50, 310, 100, 70);

            JTextField hardSkill = new JTextField();
            JLabel hardSkillLabel = new JLabel("Hard Skills");
            hardSkill.setBounds(180, 370, 600, 50);
            hardSkillLabel.setBounds(50, 370, 100, 70);

            JTextField level = new JTextField();
            JLabel levelLabel = new JLabel("Level");
            level.setBounds(180, 430, 600, 50);
            levelLabel.setBounds(50, 430, 100, 70);

            JTextField softSkill = new JTextField();
            JLabel softSkillLabel = new JLabel("Soft Skills");
            softSkill.setBounds(180, 490, 600, 50);
            softSkillLabel.setBounds(50, 490, 100, 70);


            f.add(load);
            f.add(saveChanges);
            f.add(placesOfWork);
            f.add(placesOfWorkLabel);
            f.add(tasksPerformed);
            f.add(tasksPerformedLabel);
            f.add(experience);
            f.add(experienceLabel);
            f.add(jobTitle);
            f.add(jobTitleLabel);
            f.add(teamRole);
            f.add(teamRoleLabel);
            f.add(hardSkill);
            f.add(hardSkillLabel);
            f.add(level);
            f.add(levelLabel);
            f.add(softSkill);
            f.add(softSkillLabel);

            

            saveChanges.addActionListener( e->{
                placesOfWork.setEditable(false);
                tasksPerformed.setEditable(false);
                experience.setEditable(false);
                jobTitle.setEditable(false);
                teamRole.setEditable(false);
                hardSkill.setEditable(false);
                level.setEditable(false);
                softSkill.setEditable(false);
            });





            
        }
    /*
             
                implementation

             */

    
}