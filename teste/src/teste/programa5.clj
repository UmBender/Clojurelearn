(ns teste.programa5)



(def pedido {:mochila {:quantidade 12 :preco 10.0}
             :cadeira {:quantidade 4 :preco 13.2}})

(defn imprime-e-15 [[chave valor]]
  (println chave "<e>" valor)
  15)

(defn preco-por-produto [[_ valor]]
  (* (:quantidade valor) (:preco valor)))

;; THREAD LAST
(defn total-do-pedido
  [new-pedido]
  (->> new-pedido
      (map  preco-por-produto)
      (reduce +)))

(println (map imprime-e-15 pedido))
(println (map preco-por-produto pedido))
(println (total-do-pedido pedido))


(def pedido {:mochila {:quantidade 12 :preco 10.0}
             :cadeira {:quantidade 4 :preco 13.2}
             :chaverio {:quantidade 10 :preco 0}})
(defn gratuito?
  [item]
  (<= (get item :preco 0) 0))

(println (filter (fn [[_ item]] (gratuito? item)) pedido))

(defn paga?
  [item]
  (not (gratuito? item)))
(println (filter (fn [[_ item]] (paga? item)) pedido))


;; tambem pode compor funcoes

(def pago? (comp not gratuito?))
(println (pago? {:preco 50}))
(println (pago? {:preco 0}))

