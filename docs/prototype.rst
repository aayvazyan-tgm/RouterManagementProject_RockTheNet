Prototype
=========

The target of the prototype is to write a functional piece of
software early on to get used to the SNMP protocol as soon as possible.
Parts of the prototype are plugged together from documentation and
tutorials and therefore won't follow any particular concept or design.

Invocation
~~~~~~~~~~

The prototype is defined as a sub project, ``:Prototype`` in gradles project
model. It uses the ``application`` plugin that means you can run it by typing:

.. code:: sh

    gradle :Prototype:run

Tasks
~~~~~

Extract system description
--------------------------

- rtn.prototype.SNMPManager

Query a large number of OIDs
~~~~~~~~~~~~~~~~~~~~~~~~~~~~


