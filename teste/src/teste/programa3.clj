(ns teste.programa3)
(def precos [30, 400, 100, 300, 200, 80])
;; usar get ao ineves de acessar o indeice direto pois já o tratamento
;; de erro e consegue definer valor padrão, mas o valor padrão é nulo
(precos 2)
(println (get precos 10))
(println (get precos 2 -1))
(println (get precos 100 -1))

;; atualiza um valor de um vetor, alterando seu dado

(println (update precos 0 inc))



(defn soma-1
  [valor]
  (println "estou somando um em" valor)
  (+ valor 1))
(println (update precos 0 soma-1))

(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "retorna o valor do desconto só para valores acima de 100 reais"
  [ valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))
;; mapeaia para todos os precos a aplicacao da funcao valor-descontado
(println (map valor-descontado precos))

;;

(println (range 10))
(println (filter even? (range 10)))
(println (filter aplica-desconto? precos))

(println (map valor-descontado (filter aplica-desconto? precos)))


(println (reduce + precos))

(defn minha-soma
  [valor-1 valor-2]
  (println "somando" valor-1 + valor-2)
  (+ valor-1 valor-2))

(defn unique
   [valor-1 valor-2]
   (bit-xor valor-1 valor-2))

(def arraizao [10 30 20 20 40 30 40 50 50])
(println (reduce unique arraizao))
