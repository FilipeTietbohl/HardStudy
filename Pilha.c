//Isso aqui foram umas 13 horas pra fazer.
//A ideia dessa pilha é aguentar até 10 elementos, segundo definido no MAX.
//Aluno: Filipe Tietbohl de Barros
#include <stdio.h>
#include <stdlib.h>

#define MAX 10

int pilha[MAX]; // Tamanho máximo da pilha
int topo = -1;

void push(){
  if (topo == MAX - 1){
    printf("\nA pilha atingiu seu limite de valores");
  } else {
  int NumeroAdicionado;
  printf("\nPor gentileza, insira o valor que deseja adicionar a pilha.\n");
  scanf("%d", &NumeroAdicionado);
  topo++;
  pilha[topo] = NumeroAdicionado;}
}

int peek(){
  if (topo == -1){
    printf("\nA pilha esta vazia, portanto nao tem elemento no topo");
  } else {
  printf("\nO elemento do topo e o: %d\n", pilha[topo]);
  return pilha[topo];}
}

int pop(){
  if (topo == -1){
    printf("\nA pilha esta vazia, nao tem como dar pop");
  }
  return pilha[topo--];
};

void conferirFila(){
  if (topo == -1 || topo == 0){
    printf("\nA pilha esta vazia");
  } else if (topo == MAX) {
    printf("\nA pilha esta cheia");
  } else {
    for (int i = topo; i >= 0; i--){
    printf("\n%d", pilha[i]);  
    }
  }
}

void tamanhoPilha(){
  printf("\nAtualmente a pilha tem %d elementos\n", topo+1);
}

void main(){

  int escolha;
  while(escolha != 0){
  printf("\n\nDigite na opcao desejada:");
  printf("\n1 - Inserir elemento");
  printf("\n2 - Conferir ultimo elemento inserido");
  printf("\n3 - Retirar ultimo elemento");
  printf("\n4 - Conferir valores da pilha");
  printf("\n5 - Conferir quantidade de elementos na pilha\n");
  printf("\n0 - Encerrar programa\n\n");
  scanf("%d", &escolha);

  switch (escolha)
  {
  case 1:{
    push();
    }
    break;
  case 2:{
    peek();
    }
    break;
  case 3:{
    pop();
    }
    break;
  case 4:{
    conferirFila();
    }
    break;
  case 5:{
    tamanhoPilha();
    }
    break;
  case 0:{
    printf("Encerrando programa");
    }
    break;
  default:{
    printf("Input invalido");
    break;
  }
  }
  };
};