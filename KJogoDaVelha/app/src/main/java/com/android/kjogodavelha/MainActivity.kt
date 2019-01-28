package com.android.kjogodavelha

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val playerOne = arrayListOf<Int>()
    val playerTwo = arrayListOf<Int>()
    val btn = arrayListOf<Int>()
    var currentPlayer = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.add(R.id.btn1)
        btn.add(R.id.btn2)
        btn.add(R.id.btn3)
        btn.add(R.id.btn4)
        btn.add(R.id.btn5)
        btn.add(R.id.btn6)
        btn.add(R.id.btn7)
        btn.add(R.id.btn8)
        btn.add(R.id.btn9)
    }

    fun play(position: Int, btnSelected: Button) {
        if (currentPlayer == 1) {
            btnSelected.text = "X"
            btnSelected.setBackgroundResource(R.color.preto)
            playerOne.add(position)
            currentPlayer = 2
        } else {
            btnSelected.text = "O"
            btnSelected.setBackgroundResource(R.color.preto)
            playerTwo.add(position)
            currentPlayer = 1
        }
        btnSelected.isClickable = false
        checkResult()
    }

    fun positionButtom(view: View) = when (view.id) {
        R.id.btn1 -> play(1, view as Button)
        R.id.btn2 -> play(2, view as Button)
        R.id.btn3 -> play(3, view as Button)
        R.id.btn4 -> play(4, view as Button)
        R.id.btn5 -> play(5, view as Button)
        R.id.btn6 -> play(6, view as Button)
        R.id.btn7 -> play(7, view as Button)
        R.id.btn8 -> play(8, view as Button)
        R.id.btn9 -> play(9, view as Button)
        R.id.reset-> resetar(view)
        else -> play(0,view as Button)
    }
    fun checkResult(){
        val rowl = listOf(1,2,3)
        val row2 = listOf(4,5,6)
        val row3 = listOf(7,8,9)

        val col1 = listOf(1,4,7)
        val col2 = listOf(2,5,8)
        val col3 = listOf(3,6,9)

        val diag1 = listOf(1,5,9)
        val diag2 = listOf(3,5,7)

        var winner = -1

        if (
            playerOne.containsAll(rowl) ||
            playerOne.containsAll(row2) ||
            playerOne.containsAll(row3) ||
            playerOne.containsAll(col1) ||
            playerOne.containsAll(col2) ||
            playerOne.containsAll(col3) ||
            playerOne.containsAll(diag1) ||
            playerOne.containsAll(diag2)
        ){
            winner = 1
        }else if (
            playerTwo.containsAll(rowl) ||
            playerTwo.containsAll(row2) ||
            playerTwo.containsAll(row3) ||
            playerTwo.containsAll(col1) ||
            playerTwo.containsAll(col2) ||
            playerTwo.containsAll(col3) ||
            playerTwo.containsAll(diag1) ||
            playerTwo.containsAll(diag2)
                ){
            winner = 2
        }
        if (winner == 1 || winner == 2){
            var snackbar = Snackbar.make(root_layout, "O ganhador é o Jogador número $winner", Snackbar.LENGTH_LONG)
            var snackbar_view = snackbar.view
            snackbar_view.setBackgroundColor(Color.parseColor("#FFF717"))
            snackbar.setAction("Recomeçar",{ resetar(it)})
            snackbar.show()
            for (item in btn){
                var view: Button = findViewById(item)
                view.isClickable = false
            }
        }
    }
    fun resetar(view: View){
        playerOne.clear()
        playerTwo.clear()
        recreate()
    }
}

