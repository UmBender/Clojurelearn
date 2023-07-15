(ns teste.programa2)

(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(defn mais-caro-que-100?
  [valor-bruto]
  (> valor-bruto 100))
(defn valor-descontado
  "retorna o valor do desconto só para valores acima de 100 reais"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(defn valor-descontado-anonimo
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 120))
;; predicate
(println "teste com funcao como parametro"
         (valor-descontado-anonimo aplica-desconto? 120))
(println "Com funcao anonima"
         (valor-descontado-anonimo
           (fn [valor-bruto] (> valor-bruto 100))
                                   120))
(println "teste com funcao anonima alternativa"
         (valor-descontado-anonimo
           #(> % 100) 120))
(println (aplica-desconto? 1000))

(println (aplica-desconto? 100))