package amazonpage;


import java.util.ArrayList;
import java.util.Collections;

public class Excers {


			public static void main(String args[])
			{
			 
				ArrayList<Integer> dat = new ArrayList<>();
				dat.add(50);
				dat.add(25);
				dat.add(10);
				dat.add(5);
				dat.add(28);
				dat.add(97);
				
				System.out.println(dat);
				//int ds = dat.size();
				
				//Collections.sort(dat);
				//System.out.println("poool: "+ dat);
				
				//Collections.sort(dat, Collections.reverseOrder());
				
				
				
				//System.out.println("sappi: "+ dat);
				
				for(int i=0; i<dat.size()-1;i++) {
					
					for(int j=0;j<dat.size()-1-i;j++) {
						
						if(dat.get(j)>dat.get(j+1)) {
							
							int temp = dat.get(j);
							dat.set(j, dat.get(j + 1));
		                    dat.set(j + 1, temp);
							
						}	
					}	
				}
				System.out.println("List in descending order: " + dat);
				
				
				
				
			}
		}


