const map = new google.maps.Map(
    document.getElementById("map") as HTMLElement,
    {
      zoom: 13,
      center: { lat: 59.325, lng: 18.07 },
    }
  );

  marker = new google.maps.Marker({
    map,
    draggable: true,
    animation: google.maps.Animation.DROP,
    position: { lat: 59.327, lng: 18.067 },
  });
  marker.addListener("click", toggleBounce);
}

function toggleBounce() {
  if (marker.getAnimation() !== null) {
    marker.setAnimation(null);
  } else {
    marker.setAnimation(google.maps.Animation.BOUNCE);
  }
}

declare global {
  interface Window {
    initMap: () => void;
  }
}
window.initMap = initMap;

export {};