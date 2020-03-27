// The idea was taken from monopoly/Business game
// This is a two player game
// we have a board with 16 squares.
// The game stops when anyone of the player's money becomes zero
// There are two buttons for player-1 and player-2. Player-1 or Player-2 can start.
// You can view the output in browser console window
// Iteration one with just functions and arrays. Not a very efficient code


var board=[10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160];
const player1_button = document.getElementById('player-1');
const player2_button = document.getElementById('player-2');
const printPlayerData = document.getElementById('message-area');
console.log(printPlayerData);
console.log(board.length);

console.log(player1_button);
console.log(player2_button);


player1_button.addEventListener('click',rolldice_1);
player2_button.addEventListener('click',rolldice_2);


// Player array
var player1=["venkatesh",0,1000];
var player2=["ragavi",0,1000];

// player-1 and player-2 rolling dice
function rolldice_1(){
    let position=Math.floor(Math.random()*6)+1;
    console.log("player-1 roll",position);
    changePosition_1(player1[1],position);
}

function rolldice_2(){
    let position=Math.floor(Math.random()*(6)+1);
    console.log("player-2 roll",position);
    changePosition_2(player2[1],position);
}
// update player-1 and player-2 position
function changePosition_1(old,currentPos){
    var newPosition=old+currentPos;
    player1[1]=newPosition;
    console.log("player-1",player1[1]);
    changeMoney_1(player1[1]);
}
function changePosition_2(old,currentPos){
    var newPosition=old+currentPos;
    player2[1]=newPosition;
    console.log("player-2",player2[1]);
    changeMoney_2(player2[1]);
}
// update the money

function changeMoney_1(p1){
var updateMoney=0;
    if(p1<board.length){
    updateMoney=player1[2]-board[p1-1];
}
else{
    p1=p1%15;
    updateMoney=player1[2]-board[p1-1];
}
    player1[2]=updateMoney;
console.log("player-1 money",player1[2]);
printPlayerData.innerHTML=player1;

}
function changeMoney_2(p2){
    var updateMoney=0;
    if(p2<board.length){

    updateMoney=player2[2]-board[p2-1];
}
else{
    p2=p2%15;
    updateMoney=player2[2]-board[p2-1];
}
    player2[2]=updateMoney;
    console.log("player-2 money",player2[2]);
    printPlayerData.innerHTML=player2;
}


