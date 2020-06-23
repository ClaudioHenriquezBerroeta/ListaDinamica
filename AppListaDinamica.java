class AppListaDinamica{
	public static boolean comparacion(ListaDinamica L1, ListaDinamica L2){ //código en java
		int n=L1.largo();
  		int m=L2.largo();
  		boolean encontrado=true;
  		if(n>m)
    	return false;
  
  		for(int j=0;j<m;j++){
    		encontrado=true;
    		for(int i=0;i<n;i++){
     			if(L2.recuperar(j)==L1.recuperar(i)){ 
          			j++;
    			}else{
      				encontrado=false;
    			}
    		}
    		if(encontrado)
      			return true;
	 	}
		return false;
	}

	public static void main(String[] args) {
		ListaDinamica L1 = new ListaDinamica();
		ListaDinamica L2 = new ListaDinamica();
		L1.insertar(10,0);
		L1.insertar(20,1);
		L1.insertar(30,2);
		L1.insertar(40,3);
		L1.mostrar();
		L2.insertar(1,0);
		L2.insertar(5,1);
		L2.insertar(10,2);
		L2.insertar(20,0);
		L2.insertar(30,4);
		L2.insertar(40,5);
		L2.mostrar();
		//float posicion = L.busqueda_binaria(30,L);
		//if(posicion==-1)
		//	System.out.println("El elemento no se encuentra en la lista!");
		//else
		//	System.out.println("El elemento se encuentra en la posición: "+posicion);
		if(comparacion(L1,L2))
			System.out.println("La primera lista está contenida en la segunda!");
		else
			System.out.println("La primera lista no está contenida en la segunda!");
	}
}