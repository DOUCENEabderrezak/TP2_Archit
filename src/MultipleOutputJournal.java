import java.util.ArrayList;

public class MultipleOutputJournal implements IJournal{

  String types;
  IJournal journal;

  public MultipleOutputJournal(String types){
    this.types = types;
  }

  @Override
  public void outPut_Msg(String message) {

    if(types.contains("d")){
      ArrayList<String> typesL = new ArrayList<>();
      if(types.contains("e")){
        typesL.add("ecran");
      }
      if(types.contains("f")){
        typesL.add("fichier");
      }
      if(types.contains("o")){
        typesL.add("autre");
      }
      message = new addDateJournal().addDate(message, String.join(", ",typesL));
    }
    if(types.contains("e")){
      journal = new ecranJournal();
      journal.outPut_Msg(message);
    }
    if(types.contains("f")){
      journal = new fichierJournal();
      journal.outPut_Msg(message);
    }
    if(types.contains("a")){
      journal = new ecranJournal();
      journal.outPut_Msg(message);
    }
  }

}
