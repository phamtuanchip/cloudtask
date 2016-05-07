The OpenShift `jbossas` cartridge documentation can be found at:
http://jsprhcloud-jbosssix.rhcloud.com

ssh://54042d8e4382ec1637000577@jsprhcloud-jbosssix.rhcloud.com/~/git/jsprhcloud.git/

mvn clean install -Popenshift
 
 remote connect 
 ssh 572cc4c00c1e66d2520001e9@coffee2-phamtuanchip2.rhcloud.com
 
 gear            control your application (start, stop, restart, etc)
                or deps with --cart      (gear start --cart mysql-5.1)
tail_all        tail all log files
export          list available environment variables
rm              remove files / directories
ls              list files / directories
ps              list running applications
kill            kill running applications
mysql           interactive MySQL shell
mongo           interactive MongoDB shell
psql            interactive PostgreSQL shell
quota           list disk usage

Deprecated:
ctl_app         control your application (start, stop, restart, etc)
ctl_all         control application and deps like mysql in one command
[jsprhcloud-jbosssix.rhcloud.com 54042d8e4382ec1637000577]\> export
declare -x GEM_HOME="/var/lib/openshift/54042d8e4382ec1637000577/.gem"
declare -x HISTFILE="/var/lib/openshift/54042d8e4382ec1637000577/app-root/data/.bash_history"
declare -x HOME="/var/lib/openshift/54042d8e4382ec1637000577/"
declare -x JAVA_HOME="/etc/alternatives/java_sdk_1.7.0"
declare -x LANG="en_US.UTF-8"
declare -x LD_LIBRARY_PATH="/opt/rh/v8314/root/usr/lib64:/opt/rh/mongodb24/root/usr/lib64:"
declare -x LOGNAME="54042d8e4382ec1637000577"
declare -x M2_HOME="/etc/alternatives/maven-3.0"
declare -x MAIL="/var/mail/54042d8e4382ec1637000577"
declare -x OLDPWD
declare -x OPENSHIFT_10GENMMSAGENT_DIR="/var/lib/openshift/54042d8e4382ec1637000577/10gen-mms-agent/"
declare -x OPENSHIFT_10GENMMSAGENT_IDENT="redhat:10gen-mms-agent:0.1:0.0.11"
declare -x OPENSHIFT_APP_DNS="jsprhcloud-jbosssix.rhcloud.com"
declare -x OPENSHIFT_APP_NAME="jsprhcloud"
declare -x OPENSHIFT_APP_SSH_KEY="/var/lib/openshift/54042d8e4382ec1637000577/.openshift_ssh/id_rsa"
declare -x OPENSHIFT_APP_SSH_PUBLIC_KEY="/var/lib/openshift/54042d8e4382ec1637000577/.openshift_ssh/id_rsa.pub"
declare -x OPENSHIFT_APP_UUID="54042d8e4382ec1637000577"
declare -x OPENSHIFT_AUTO_DEPLOY="true"
declare -x OPENSHIFT_BROKER_HOST="openshift.redhat.com"
declare -x OPENSHIFT_BUILD_DEPENDENCIES_DIR="/var/lib/openshift/54042d8e4382ec1637000577/app-root/runtime/build-dependencies/"
declare -x OPENSHIFT_CARTRIDGE_SDK_BASH="/usr/lib/openshift/cartridge_sdk/bash/sdk"
declare -x OPENSHIFT_CARTRIDGE_SDK_RUBY="/usr/lib/openshift/cartridge_sdk/ruby/sdk.rb"
declare -x OPENSHIFT_CLOUD_DOMAIN="rhcloud.com"
declare -x OPENSHIFT_DATA_DIR="/var/lib/openshift/54042d8e4382ec1637000577/app-root/data/"
declare -x OPENSHIFT_DEPENDENCIES_DIR="/var/lib/openshift/54042d8e4382ec1637000577/app-root/runtime/dependencies/"
declare -x OPENSHIFT_DEPLOYMENTS_DIR="/var/lib/openshift/54042d8e4382ec1637000577/app-deployments/"
declare -x OPENSHIFT_DEPLOYMENT_BRANCH="master"
declare -x OPENSHIFT_DEPLOYMENT_TYPE="git"
declare -x OPENSHIFT_GEAR_DNS="jsprhcloud-jbosssix.rhcloud.com"
declare -x OPENSHIFT_GEAR_MEMORY_MB="512"
declare -x OPENSHIFT_GEAR_NAME="jsprhcloud"
declare -x OPENSHIFT_GEAR_UUID="54042d8e4382ec1637000577"
declare -x OPENSHIFT_HAPROXY_DIR="/var/lib/openshift/54042d8e4382ec1637000577/haproxy/"
declare -x OPENSHIFT_HAPROXY_IDENT="redhat:haproxy:1.4:0.0.24"
declare -x OPENSHIFT_HAPROXY_IP="127.12.55.2"
declare -x OPENSHIFT_HAPROXY_LOG_DIR="/var/lib/openshift/54042d8e4382ec1637000577/app-root/logs/"
declare -x OPENSHIFT_HAPROXY_PATH_ELEMENT="/var/lib/openshift/54042d8e4382ec1637000577/haproxy/usr/bin"
declare -x OPENSHIFT_HAPROXY_PORT="8080"
declare -x OPENSHIFT_HAPROXY_PROXY_GEAR_TTL="3"
declare -x OPENSHIFT_HAPROXY_PROXY_PORT="64305"
declare -x OPENSHIFT_HAPROXY_STATUS_IP="127.12.55.3"
declare -x OPENSHIFT_HAPROXY_STATUS_PORT="8080"
declare -x OPENSHIFT_HAPROXY_VERSION="1.4"
declare -x OPENSHIFT_HOMEDIR="/var/lib/openshift/54042d8e4382ec1637000577/"
declare -x OPENSHIFT_JBOSSAS_CLUSTER="jsprhcloud-jbosssix.rhcloud.com[64302]"
declare -x OPENSHIFT_JBOSSAS_CLUSTER_PORT="7600"
declare -x OPENSHIFT_JBOSSAS_CLUSTER_PROXY_PORT="64302"
declare -x OPENSHIFT_JBOSSAS_CLUSTER_REMOTING="jsprhcloud-jbosssix.rhcloud.com[4447]"
declare -x OPENSHIFT_JBOSSAS_DIR="/var/lib/openshift/54042d8e4382ec1637000577/jbossas/"
declare -x OPENSHIFT_JBOSSAS_HTTP_PORT="8080"
declare -x OPENSHIFT_JBOSSAS_HTTP_PROXY_PORT="64301"
declare -x OPENSHIFT_JBOSSAS_IDENT="redhat:jbossas:7:0.0.26"
declare -x OPENSHIFT_JBOSSAS_IP="127.12.55.1"
declare -x OPENSHIFT_JBOSSAS_JDK6="/etc/alternatives/java_sdk_1.6.0"
declare -x OPENSHIFT_JBOSSAS_JDK7="/etc/alternatives/java_sdk_1.7.0"
declare -x OPENSHIFT_JBOSSAS_JDK8="/etc/alternatives/java_sdk_1.8.0"
declare -x OPENSHIFT_JBOSSAS_LOG_DIR="/var/lib/openshift/54042d8e4382ec1637000577/app-root/logs/"
declare -x OPENSHIFT_JBOSSAS_MANAGEMENT_HTTP_PORT="9990"
declare -x OPENSHIFT_JBOSSAS_MANAGEMENT_NATIVE_PORT="9999"
declare -x OPENSHIFT_JBOSSAS_MESSAGING_PORT="5445"
declare -x OPENSHIFT_JBOSSAS_MESSAGING_PROXY_PORT="64303"
declare -x OPENSHIFT_JBOSSAS_MESSAGING_THROUGHPUT_PORT="5455"
declare -x OPENSHIFT_JBOSSAS_PATH_ELEMENT="/etc/alternatives/java_sdk_1.7.0/bin:/etc/alternatives/maven-3.0/bin:/var/lib/openshift/54042d8e4382ec1637000577/jbossas//bin/tools"
declare -x OPENSHIFT_JBOSSAS_REMOTING_PORT="4447"
declare -x OPENSHIFT_JBOSSAS_REMOTING_PROXY_PORT="64304"
declare -x OPENSHIFT_JBOSSAS_VERSION="7"
declare -x OPENSHIFT_JBOSSAS_WEBSOCKET_PORT="8676"
declare -x OPENSHIFT_KEEP_DEPLOYMENTS="1"
declare -x OPENSHIFT_LOGIN="phamtuanchip"
declare -x OPENSHIFT_LOG_DIR="/var/lib/openshift/54042d8e4382ec1637000577/app-root/logs/"
declare -x OPENSHIFT_MONGODB_DB_GEAR_DNS="54812e5aecb8d4be23000051-jbosssix.rhcloud.com"
declare -x OPENSHIFT_MONGODB_DB_GEAR_UUID="54812e5aecb8d4be23000051"
declare -x OPENSHIFT_MONGODB_DB_HOST="54812e5aecb8d4be23000051-jbosssix.rhcloud.com"
declare -x OPENSHIFT_MONGODB_DB_PASSWORD="hZdXjbmA6MK4"
declare -x OPENSHIFT_MONGODB_DB_PORT="53656"
declare -x OPENSHIFT_MONGODB_DB_URL="mongodb://admin:hZdXjbmA6MK4@54812e5aecb8d4be23000051-jbosssix.rhcloud.com:53656/"
declare -x OPENSHIFT_MONGODB_DB_USERNAME="admin"
declare -x OPENSHIFT_MONGODB_LD_LIBRARY_PATH_ELEMENT="/opt/rh/v8314/root/usr/lib64:/opt/rh/mongodb24/root/usr/lib64"
declare -x OPENSHIFT_MONGODB_PATH_ELEMENT="/opt/rh/mongodb24/root/usr/bin"
declare -x OPENSHIFT_NAMESPACE="jbosssix"
declare -x OPENSHIFT_PRIMARY_CARTRIDGE_DIR="/var/lib/openshift/54042d8e4382ec1637000577/jbossas/"
declare -x OPENSHIFT_PYPI_MIRROR_URL="http://mirror1.ops.rhcloud.com/mirror/python/web/simple"
declare -x OPENSHIFT_REPO_DIR="/var/lib/openshift/54042d8e4382ec1637000577/app-root/runtime/repo/"
declare -x OPENSHIFT_SECRET_TOKEN="Ok3J2CigucYrwzriGU0Q8w37ejPAjEAT-zGBMwCHE9sl6M3tHBjaZwU2TZ4sW_nOeHzjSQ5W8Xlcg1bJeyIsEwu4SeuYnMA2wtfdjd2iRQnKm78D22eL2xGRFZ1VOUnj"
declare -x OPENSHIFT_TMP_DIR="/tmp/"
declare -x OPENSHIFT_UMASK="077"
declare -x PATH="/etc/alternatives/java_sdk_1.7.0/bin:/etc/alternatives/maven-3.0/bin:/var/lib/openshift/54042d8e4382ec1637000577/jbossas//bin/tools:/var/lib/openshift/54042d8e4382ec1637000577/haproxy/usr/bin:/opt/rh/mongodb24/root/usr/bin:/bin:/usr/bin:/usr/sbin"
declare -x PS1="[jsprhcloud-jbosssix.rhcloud.com \\W]\\> "
declare -x PWD="/var/lib/openshift/54042d8e4382ec1637000577"
declare -x SELINUX_LEVEL_REQUESTED=""
declare -x SELINUX_ROLE_REQUESTED=""
declare -x SELINUX_USE_CURRENT_RANGE=""
declare -x SHELL="/bin/bash"
declare -x SHLVL="1"
declare -x SSH_CLIENT="42.114.204.110 54150 22"
declare -x SSH_CONNECTION="42.114.204.110 54150 172.16.10.241 22"
declare -x SSH_TTY="/dev/pts/0"
declare -x TERM="xterm"
declare -x TMOUT="300"
declare -x TMP="/tmp/"
declare -x TMPDIR="/tmp/"
declare -x TMP_DIR="/tmp/"
declare -x USER="54042d8e4382ec1637000577"


 
 
 new version move to 
 http://coffee2-phamtuanchip2.rhcloud.com/
 remote access 
 ssh 572cc4c00c1e66d2520001e9@coffee2-phamtuanchip2.rhcloud.com
 inside gitbash
 