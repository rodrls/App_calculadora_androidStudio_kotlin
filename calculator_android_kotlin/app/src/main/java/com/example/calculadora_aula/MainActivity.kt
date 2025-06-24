package com.example.calculadora_aula

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView


class MainActivity : AppCompatActivity() {
     var num1 = 0f
     var num2 = 0f

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valorUm = findViewById<TextView>(R.id.valores)
        val valorDois = findViewById<TextView>(R.id.valores2)
        val operador = findViewById<TextView>(R.id.operadores)
        val resultado = findViewById<TextView>(R.id.resultado)
        var calculo = 0f


        val botaoCE = findViewById<Button>(R.id.ce)
        val botaoUm = findViewById<Button>(R.id.num1)
        val botaoDois = findViewById<Button>(R.id.num2)
        val botaoTres = findViewById<Button>(R.id.num3)
        val botaoQuatro = findViewById<Button>(R.id.num4)
        val botaoCinco = findViewById<Button>(R.id.num5)
        val botaoSeis = findViewById<Button>(R.id.num6)
        val botaoSete = findViewById<Button>(R.id.num7)
        val botaoOito = findViewById<Button>(R.id.num8)
        val botaoNove = findViewById<Button>(R.id.num9)
        val botaoZero = findViewById<Button>(R.id.num0)
        val botaoLimpar = findViewById<ImageButton>(R.id.Limpar)
        val botaoDivisao = findViewById<Button>(R.id.divisao)
        val botaoMultiplicacao = findViewById<Button>(R.id.multiplicacao)
        val botaoSubtracao = findViewById<Button>(R.id.subtracao)
        val botaoSoma = findViewById<Button>(R.id.soma)
        val botaoPonto = findViewById<Button>(R.id.ponto)
        val botaoIgual = findViewById<Button>(R.id.igual)

        //funcao para limpar os numeros
        botaoLimpar.setOnClickListener {
            if (operador.text == "") {
                if (valorUm.text != ""){
                    valorUm.text = valorUm.text.dropLast(1)
                    if(valorUm.text != ""){
                        num1 = (valorUm.text as String).toFloat()
                    }else
                        num1 = 0f
                }
            }else if (operador.text != "") {
                if (valorDois.text != "") {
                    valorDois.text = valorDois.text.dropLast(1)
                    if(valorDois.text != ""){
                        num2 = (valorDois.text as String).toFloat()
                    }else
                        num2 = 0f
                }else if(valorDois.text == ""){
                    operador.text = ""
                }
            }
        }

        //funcao para adicionar um ponto
        botaoPonto.setOnClickListener {
            if (operador.text == "") {
                if (!valorUm.text.contains(".")) { // evita múltiplos pontos
                    valorUm.text = "${valorUm.text}."
                }
                num1 = valorUm.text.toString().toFloat()

            } else {
                if (!valorDois.text.contains(".")) {
                    valorDois.text = "${valorDois.text}."
                }
                num2 = valorDois.text.toString().toFloat()

            }
        }


        //funcao para realizar o calculo entre os numeros
            botaoIgual.setOnClickListener {
                when (operador.text) {
                    "+" -> {
                        calculo = (num1 + num2)
                        // Verifica se o resultado é inteiro
                        if (calculo % 1.0 == 0.0) {
                            resultado.text = calculo.toInt().toString()
                        } else {
                            resultado.text = calculo.toString()
                        }
                    }
                    "-" -> {
                        calculo = (num1 - num2)
                        if (calculo % 1.0 == 0.0) {
                            resultado.text = calculo.toInt().toString()
                        } else {
                            resultado.text = calculo.toString()
                        }
                    }
                    "*" -> {
                        calculo = (num1 * num2)
                        if (calculo % 1.0 == 0.0) {
                            resultado.text = calculo.toInt().toString()
                        } else {
                            resultado.text = calculo.toString()
                        }
                    }
                    "/" -> {
                        calculo = (num1 / num2)
                        if (calculo % 1.0 == 0.0) {
                            resultado.text = calculo.toInt().toString()
                        } else {
                            resultado.text = calculo.toString()
                        }
                    }
                }
            }

        //funcao para adicionar o botao 0
            botaoZero.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}0"
                    num1 = (valorUm.text as String).toFloat()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}0"
                    num2 = (valorDois.text as String).toFloat()
                }
            }

        //funcao para adicionar o botao 1
            botaoUm.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}1"
                    num1 = (valorUm.text as String).toFloat()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}1"
                    num2 = (valorDois.text as String).toFloat()
                }
            }

        //funcao para adicionar o botao 2
            botaoDois.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}2"
                    num1 = (valorUm.text as String).toFloat()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}2"
                    num2 = (valorDois.text as String).toFloat()
                }
            }

        //funcao para adicionar o botao 3
            botaoTres.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}3"
                    num1 = (valorUm.text as String).toFloat()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}3"
                    num2 = (valorDois.text as String).toFloat()
                }
            }

        //funcao para adicionar o botao 4
            botaoQuatro.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}4"
                    num1 = (valorUm.text as String).toFloat()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}4"
                    num2 = (valorDois.text as String).toFloat()
                }
            }

        //funcao para adicionar o botao 5
            botaoCinco.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}5"
                    num1 = (valorUm.text as String).toFloat()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}5"
                    num2 = (valorDois.text as String).toFloat()
                }
            }

        //funcao para adicionar o botao 6
            botaoSeis.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}6"
                    num1 = (valorUm.text as String).toFloat()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}6"
                    num2 = (valorDois.text as String).toFloat()
                }
            }

        //funcao para adicionar o botao 7
            botaoSete.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}7"
                    num1 = (valorUm.text as String).toFloat()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}7"
                    num2 = (valorDois.text as String).toFloat()
                }
            }

        //funcao para adicionar o botao 8
            botaoOito.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}8"
                    num1 = (valorUm.text as String).toFloat()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}8"
                    num2 = (valorDois.text as String).toFloat()
                }
            }

        //funcao para adicionar o botao 9
            botaoNove.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}9"
                    num1 = (valorUm.text as String).toFloat()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}9"
                    num2 = (valorDois.text as String).toFloat()
                }
            }

        //funcao para limpar todos os campos da calculadora
            botaoCE.setOnClickListener {
                valorUm.text = ""
                valorDois.text = ""
                operador.text = ""
                resultado.text = ""
            }

        //funcao para dividir
            botaoDivisao.setOnClickListener {
                operador.text = ""
                operador.text = "/"
                if(valorUm.text != ""){
                    if(valorDois.text != ""){
                        valorUm.text = resultado.text
                        num1 = (valorUm.text as String).toFloat()
                        operador.text = "/"
                        valorDois.text = ""
                        resultado.text = ""
                    }
                }
            }

        //funcao para multiplicar
            botaoMultiplicacao.setOnClickListener {
                operador.text = ""
                operador.text = "*"
                if(valorUm.text != ""){
                    if(valorDois.text != ""){
                        valorUm.text = resultado.text
                        num1 = (valorUm.text as String).toFloat()
                        operador.text = "*"
                        valorDois.text = ""
                        resultado.text = ""
                    }
                }
            }

        //funcao para subtrair
            botaoSubtracao.setOnClickListener {
                operador.text = ""
                operador.text = "-"
                if(valorUm.text != ""){
                    if(valorDois.text != ""){
                        valorUm.text = resultado.text
                        num1 = (valorUm.text as String).toFloat()
                        operador.text = "-"
                        valorDois.text = ""
                        resultado.text = ""
                    }
                }
            }

        //funcao para somar
            botaoSoma.setOnClickListener {
                operador.text = ""
                operador.text = "+"
                if(valorUm.text != ""){
                    if(valorDois.text != ""){
                        valorUm.text = resultado.text
                        num1 = (valorUm.text as String).toFloat()
                        operador.text = "+"
                        valorDois.text = ""
                        resultado.text = ""
                    }
                }

            }

    }
}


