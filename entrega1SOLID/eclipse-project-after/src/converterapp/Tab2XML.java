package converterapp;


public class Tab2XML implements Transformer{

		public String transform(String s){
			
	         StringBuilder resultado = new StringBuilder();
	         
	         
             String[] tokens = s.split("\t");
             
             resultado.append("<products>\n");
             for(int i = 0; i<tokens.length-1;i++){
                resultado.append("<product>\n\t<name>" + tokens[i] + "</name>\n\t<price>"+ tokens[i+1] + "</price>\n</product>\n");
               i++;
             }
             resultado.append("</products>");
           return resultado.toString();


		}

}
