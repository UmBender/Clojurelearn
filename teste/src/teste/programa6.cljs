(ns teste.programa6)

(def minha-colecao (range 1 100 2))
(defn funcao-primo
  [valor]
  (if (>= valor 50)
    true
    false))
(defn eh-maior-que-50?
  [valor]
  (if (funcao-primo valor)
    (println "maior que 50")
    (println "menor que 50")))

(defn fibonacci
  [valor]
  (if (<= valor 0)
    1
    (+ (fibonacci (- valor 2)) (fibonacci (- valor 1)))))

(defn cria-array
  [vetor inicio fim]
  (if (<= inicio fim)
    (cria-array (conj vetor inicio) (inc inicio) fim)
    vetor))
(println (fibonacci 7))
(println (cria-array [] 0 100))
(map eh-maior-que-50? minha-colecao)

