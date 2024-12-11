package com.calculadora.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class CalculadoraController {

    private static final Logger logger = LoggerFactory.getLogger(CalculadoraController.class);

    @CrossOrigin
    @GetMapping("/operaciones/suma")
    public double suma(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        double result = num1 + num2;
        logger.info("Operación: Suma, Número 1: {}, Número 2: {}, Resultado: {}", num1, num2, result);
        return result;
    }

    @CrossOrigin
    @GetMapping("/operaciones/resta")
    public double resta(@RequestParam("numeroUno") double numeroUno, @RequestParam("numeroDos") double numeroDos) {
        double result = numeroUno - numeroDos;
        logger.info("Operación: Resta, Número 1: {}, Número 2: {}, Resultado: {}", numeroUno, numeroDos, result);
        return result;
    }

    @CrossOrigin
    @GetMapping("/operaciones/factorial")
    public double factorial(@RequestParam("base") double base) {
        double result = (base >= 1) ? factorial(base - 1) * base : 1;
        logger.info("Operación: Factorial, Base: {}, Resultado: {}", base, result);
        return result;
    }

    @CrossOrigin
    @GetMapping("/operaciones/multiplicacion")
    public double multiplicacion(@RequestParam("numeroUno") double numeroUno, @RequestParam("numeroDos") double numeroDos) {
        double result = numeroUno * numeroDos;
        logger.info("Operación: Multiplicación, Número 1: {}, Número 2: {}, Resultado: {}", numeroUno, numeroDos, result);
        return result;
    }

    @CrossOrigin
    @GetMapping("/operaciones/division")
    public double division(@RequestParam("numero_1") double numero_1, @RequestParam("numero_2") double numero_2) {
        double result = numero_1 / numero_2;
        logger.info("Operación: División, Número 1: {}, Número 2: {}, Resultado: {}", numero_1, numero_2, result);
        return result;
    }

    @CrossOrigin
    @GetMapping("/operaciones/potencia")
    public double potencia(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        double result = Math.pow(num1, num2);
        logger.info("Operación: Potencia, Número 1: {}, Número 2: {}, Resultado: {}", num1, num2, result);
        return result;
    }

    @CrossOrigin
    @GetMapping("/operaciones/modulo")
    public double modulo(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        double result = num1 % num2;
        logger.info("Operación: Módulo, Número 1: {}, Número 2: {}, Resultado: {}", num1, num2, result);
        return result;
    }

    @CrossOrigin
    @GetMapping("/operaciones/raizCuadrada")
    public double raizCuadrada(@RequestParam("raiz") double raiz) {
        double result = Math.sqrt(raiz);
        logger.info("Operación: Raíz Cuadrada, Número: {}, Resultado: {}", raiz, result);
        return result;
    }

    @CrossOrigin
    @GetMapping("/operaciones/logaritmo")
    public double logaritmo(@RequestParam("log") double log) {
        double result = Math.log(log);
        logger.info("Operación: Logaritmo, Número: {}, Resultado: {}", log, result);
        return result;
    }

    @CrossOrigin
    @GetMapping("/operaciones/sin")
    public double sen(@RequestParam("seno") double seno) {
        double result = Math.sin(seno);
        logger.info("Operación: Seno, Número: {}, Resultado: {}", seno, result);
        return result;
    }

    @CrossOrigin
    @GetMapping("/operaciones/cos")
    public double cos(@RequestParam("cos") double cos) {
        double result = Math.cos(cos);
        logger.info("Operación: Coseno, Número: {}, Resultado: {}", cos, result);
        return result;
    }
    @CrossOrigin
    @GetMapping("/operaciones/tan")
    public double tan(@RequestParam("tan") double tan) {
        double result = Math.tan(tan);
        logger.info("Operación: Tangente, Número: {}, Resultado: {}", tan, result);
        return result;
    }
    @CrossOrigin
    @GetMapping("/operaciones/e")
    public double e(@RequestParam("e") double e) {
        double result = Math.exp(e);
        logger.info("Operación: Exponencial, Número: {}, Resultado: {}", e, result);
        return result;
    }
    @CrossOrigin
    @GetMapping("/operaciones/sinh")
    public double senh(@RequestParam("senoh") double senoh) {
        double result = Math.sinh(senoh);
        logger.info("Operación: Senh, Número: {}, Resultado: {}", senoh, result);
        return result;
    }
    @CrossOrigin
    @GetMapping("/operaciones/cosh")
    public double cosh(@RequestParam("cosh") double cosh) {
        double result = Math.cosh(cosh);
        logger.info("Operación: Cosh, Número: {}, Resultado: {}", cosh, result);
        return result;
    }
    @CrossOrigin
    @GetMapping("/operaciones/tanh")
    public double tanh(@RequestParam("tanh") double tanh) {
        double result = Math.tanh(tanh);
        logger.info("Operación: Tanh, Número: {}, Resultado: {}", tanh, result);
        return result;
    }
}
