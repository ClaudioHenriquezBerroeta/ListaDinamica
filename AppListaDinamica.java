class AppListaDinamica{
	public static void main(String[] args) {
		ListaDinamica L = new ListaDinamica();
		L.insertar(10,0);
		L.insertar(20,1);
		L.insertar(30,2);
		L.insertar(40,3);
		L.mostrar();
		L.eliminar(2);
		L.mostrar();
		L.localizar(10);
		L.recuperar(1);

		//System.out.println(L.cabeza.sgte.dato);
	}
}