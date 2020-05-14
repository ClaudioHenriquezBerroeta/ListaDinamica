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
			while((temp.sgte!= null)&&(i!=p)){
				i++;
				temp=temp.sgte;
			}
			if(i<p) System.out.println("La posición indicada no existe!");
			else insertar(aux,temp);
		}
	}
	private void insertar(NodoLista x,NodoLista p){
			x.sgte=p.sgte;
			p.sgte=x;
	}
	void mostrar(){
		int i;
		NodoLista temp=cabeza;
		while(temp.sgte!=null){
			System.out.print(temp.sgte.dato+"-");
			temp=temp.sgte;
		}
		System.out.println("");
	}

}