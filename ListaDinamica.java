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

	public void eliminar(int p){
		NodoLista temp=cabeza;
		int i=0;
		if(p<0) System.out.println("Posicion invalida!");
		else{
			while((temp.sgte!= null)&&(i!=p)){
				i++;
				temp=temp.sgte;
			}
			if(i<p) System.out.println("La posición indicada no existe!");
			else eliminar(temp);
		}
	}
	private void eliminar(NodoLista p){
			p.sgte=p.sgte.sgte;
	}
	public int localizar (int x){
		NodoLista temp=cabeza;
		int i=0;
		while(temp.sgte!= null){
			if(temp.sgte.dato==x) return i;
			i++;
			temp=temp.sgte;
		}
		System.out.println("No se econtró el elemento");
		return -1;
	}
	public int recuperar(int p){
		NodoLista temp=cabeza;
		int i=0;
		if(p<0) System.out.println("Posicion invalida!");
		else{
			while((temp.sgte!= null)&&(i!=p)){
				i++;
				temp=temp.sgte;
			}
			if(i<p) System.out.println("La posición indicada no existe!");
			else {
				System.out.println("El elemento es: "+temp.sgte.dato);
				return temp.sgte.dato;
			}
		}
		return -1;
	}






}