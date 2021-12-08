import java.awt.*; 
 class MenuExampleJava extends Frame 
 { 
        MenuExampleJava() 
       { 
            MenuBar menuBar = new MenuBar(); 
            setMenuBar(menuBar); 

            Menu menuFile = new Menu("File"); 
            Menu menuEdit = new Menu("Edit"); 
            Menu menuView = new Menu("View"); 

            menuBar.add(menuFile); 
            menuBar.add(menuEdit); 
            menuBar.add(menuView); 

            MenuItem itemOpen = new MenuItem("Open"); 
            MenuItem itemSave = new MenuItem("Save"); 
            MenuItem itemExit = new MenuItem("Exit"); 

            menuFile.add(itemOpen); 
            menuFile.add(itemSave); 
            menuFile.add(itemExit); 

            MenuItem itemcopy = new MenuItem("Font"); 
            menuEdit.add(itemcopy); 
      } 
 } 
   class MenuExample
   { 
           public static void main(String args[]) 
          { 
               MenuExampleJava frame = new MenuExampleJava(); 
               frame.setTitle("Menu in Java Example"); 
               frame.setSize(400,300); 
               frame.setResizable(false); 
               frame.setVisible(true); 
          } 
   } 
 