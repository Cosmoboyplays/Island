Модель острова с изменяемыми параметрами, состоящая из массива локаций (например, 100х20 клеток).
Локации будут заполнены растительностью и животными.
Заполнение локаций происходит рандомным образом, учитывая правила заполнения одной клетки.
Жизненный цикл одного животного происходит в 1 функции класса LiveSimulator - live.

Реализованы алгоритмы:
поедания друг друга и травы (учитывая особенности питания и вес животных)
размножения (животные точно размножаться если есть пара на локации, не будет превышать число возможных осыбей на лакации)
перемещения рандомом (учитывая размеры локации и особенности перемещения и количество животных на локациях)

симуляцию можно очень гибко настроить 
Старался по максимому использовать ООП. Можно больше

Для того чтобы животные умирали без еды - введен параметр вычита жизненной силы в %. Его можно задать в начале, и это будет означать сколько процентов жизненной силы вычитается каждый такт. 
При этом еда восполняет жизненную силу в зависимости от своего веса.

Трава растет в другом потоке, от роста травы также зависит сколько будут жить животные.


НЕ РЕАЛИЗОВАЛ

методы: покушать, размножиться, выбрать направление передвижения у каждого животного. 
Делал это более астрактно через перебор всех хищников, травоядных.

и еще несколько не критичных вещей из задания homework.html - прикреплен 

