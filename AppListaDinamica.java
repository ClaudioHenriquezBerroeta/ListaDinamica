class AppListaDinamica{
	public static void main(String[] args) {
		ListaDinamica L = new ListaDinamica();
		L.insertar(10,0);
		L.insertar(20,1);
		L.insertar(30,2);
		System.out.println(L.cabeza.sgte.dato);
	}
}