<p>Si el tamaño del array bidireccional ocupa la superficie de la isla, y que solo podemos <i>movernos</i>, <i>arriba</i>, <i>abajo</i>, <i>izquierda</i> y <i>derecha</i>, por ende el agua va a poder fluir en los siguientes casos:</p>

<ul>
<li>
que la posición en la que se encuentre se encuentre e algun bode.
</li>
<li>Que el numero no este entro de ningun bode pero que tenga almenos un nummero menor a su alrededor</li> 
</ul>

<p>Con la siguiente parametría</p>

<pre>	
static int[][] islandSurface = { 
			{ 9, 4, 8, 2, 7 }, 
			{ 1, 5, 9, 5, 4 }, 
			{ 2, 7, 3, 8, 6 }, 
			{ 4, 5, 4, 6, 1 }, 
			{ 1, 2, 7, 9, 8 } 
};
</pre>

<ul>
<li>(0, 0) --> true</li>
<li>(0, 1) --> true</li>
<li>(0, 2) --> true</li>
<li>(0, 3) --> true</li>
<li>(0, 4) --> true</li>
<li>(1, 0) --> true</li>
<li>(1, 1) --> true</li>
<li>(1, 2) --> true</li>
<li>(1, 3) --> true</li>
<li>(1, 4) --> true</li>
<li>(2, 0) --> true</li>
<li>(2, 1) --> true</li>
<li>(2, 2) --> false</li>
<li>(2, 3) --> true</li>
<li>(2, 4) --> true</li>
<li>(3, 0) --> true</li>
<li>(3, 1) --> true</li>
<li>(3, 2) --> true</li>
<li>(3, 3) --> true</li>
<li>(3, 4) --> true</li>
<li>(4, 0) --> true</li>
<li>(4, 1) --> true</li>
<li>(4, 2) --> true</li>
<li>(4, 3) --> true</li>
<li>(4, 4) --> true</li>
</ul>
