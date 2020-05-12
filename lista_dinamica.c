#include <stdlib.h>
struct nodo { 
	int dato;
	struct nodo *sgte;
};

struct nodo *constructor(void){
	struct nodo *L = (struct nodo *)malloc(sizeof(struct nodo)); 
	L->sgte=NULL;
	return L;
}

int main(int argc, char const *argv[])
{
	/* code */
	return 0;
}