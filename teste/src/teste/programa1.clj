(ns teste.programa1)
;; cria variavel
(def valor 12)

;; cria vetor
(def estoque ["mochila", "seila"])

;; Gera novo vetor concatenado com outro, mas sem alterar os antigos, apenas o retorna
(conj estoque "teste")

;; definir uma funcao em clojure
;; (defn nome-funcao [parametros] ...
(defn imprime-mensagem []
  (println "Minha mensagem")
  )

(defn aplica-desconto [valor-bruto]
  (* valor-bruto 0.9)
  )

(defn valor-desconto
  "retorna o valor com desconto de 10%."
  [valor-bruto]
  (let [taxa-de-desconto (/ 10 100)
        desconto (* valor-bruto taxa-de-desconto)]
    (- valor-bruto desconto)))
(defn descoto-acima
  "retorna o valor do desconto só para valores acima de 100 reais"
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println (descoto-acima 12))
(println
  (valor-desconto 1000))                                    ;; big int : 10N ; big decima : 10M
;; float: 10.0
;; int: 10
;; ratio: 12/5

