class NodoLista{
	int dato;
	NodoLista sgte;

	NodoLista(){ //crea cabecera
		dato=0;
		sgte=null;
	}
	NodoLista(int x){
		dato=x;
		sgte=null;
	}
}