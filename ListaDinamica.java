class ListaDinamica{
	NodoLista cabeza;

	ListaDinamica(){
		cabeza = new NodoLista();
		cabeza.sgte=null;
	}

	public void insertar(int x, int p){
		NodoLista aux=new NodoLista(x);
		NodoLista temp=cabeza;
		int i=0;
		if(p<0) System.out.println("Posicion invalida!");
		else{
			while(temp.sgte!= null){
				System.out.println("entró al while");
				if(i==p){//encontré la posición
					System.out.println("encontró la posicion");
					insertar(aux,temp);
				}
				i++;
				temp=temp.sgte;
			}
			if(i<p) System.out.println("La posición indicada no existe!");
			insertar(aux,temp);
		}
				

	}
	private void insertar(NodoLista x,NodoLista p){
			x.sgte=p.sgte;
			p.sgte=x;
	}
	//public mostrar()


}