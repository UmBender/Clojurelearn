(ns teste.programa4)
(def estoque {"Mochila" 10, "Camiseta" 5})
(println estoque)
(println "Temos" (count estoque) "elementos")
(println "Chaves são" (keys estoque))
(println "Valores são" (vals estoque))

;; pode se usar strings como chaves para o hashmap
;; mas no geral usa-se keywords
; keyword
; :mochila
(def estoque {
              :mochila 10
              :estoque 5})

(println (filter even? (vals estoque)))

(println (assoc estoque :cadeira 3))

(def pedido {
              :mochila {:quantidade 10 :preco 10}
              :cadeira {:quantidade 4  :preco 2}})
(println (:quantidade (:mochila pedido)))
(println (update-in pedido [:mochila :quantidade] inc))

;; THREADING

(println pedido)
(println (-> pedido
             :mochila
             :quantidade))