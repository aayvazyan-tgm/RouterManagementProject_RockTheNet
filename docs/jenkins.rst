Jenkins
=======

Jenkins is an open source continuous integration tool written in Java. [10]

Continuous integration
~~~~~~~~~~~~~~~~~~~~~~

Continuous Integration is a software development practice where members
of a team integrate their work frequently, usually each person integrates
at least daily - leading to multiple integrations per day. Each integration
is verified by an automated build (including test) to detect integration
errors as quickly as possible. Many teams find that this approach leads
to significantly reduced integration problems and allows a team to develop
cohesive software more rapidly. [11]

Our setup
~~~~~~~~~

Our Jenkins instance is running on Ubuntu server in the Amazons AWS cloud.
It can be accessed at http://ci.truh.in/. It automaticly schedules a build
everytime something gets changed on our Github repo.

Besides checking if our sources are buildable, Jenkin will also run our unit
tests, create javadocs, assemble our Sphinx-doc documentation and provide a
fancy badge showing us if the last build failed or succeded.

.. image:: http://ci.truh.in/buildStatus/icon?job=RockTheNet

Nginx
-----

To enable HTTPS and to have Jenkins listen on the default ports (80, 443)
without changing Jenkins configuration, Jenkins runs behind an nginx proxy
server. Here is the nginx configuration, located at ``/etc/nginx/nginx.conf``:

.. literalinclude:: nginx.conf

Installation
~~~~~~~~~~~~

On Ubuntu you can install Jenkins with:

.. code:: bash

    wget -q -O - https://jenkins-ci.org/debian/jenkins-ci.org.key \
        | sudo apt-key add -
    sudo sh -c 'echo deb http://pkg.jenkins-ci.org/debian binary/ \
        > /etc/apt/sources.list.d/jenkins.list'
    sudo apt-get update
    sudo apt-get install jenkins

[12]

The other configuration can be made using the webinterface.
