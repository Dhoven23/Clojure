(loop [j 1]
    (when (<= j 100)
        (def y 1)
        (def x 1)
        (println x)
        (println y)
        (loop [i 1]
            (when (<= x 2880067194370816120)
                (def z (+ x y))
                (def x y)
                (def y z)
                (println z)
            (recur (+ i 1))))
    (recur (+ j 1))))
